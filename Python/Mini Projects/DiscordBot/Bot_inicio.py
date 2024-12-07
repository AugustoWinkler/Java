import asyncio
import discord
import random
import json
from discord import Color
from PIL import Image, ImageOps
import io

intents = discord.Intents.default()
intents.message_content = True


class MyClient(discord.Client):
    async def on_ready(self):
        print('Logged on as {0}!'.format(self.user))

    async def on_message(self, message):
        if message.content.startswith('!lol'):
            # Carrega os dados dos personagens e falas do arquivo JSON
            with open('personagens.json', encoding='utf-8') as json_file:
                personagens = json.load(json_file)

            personagem_escolhido = random.choice(list(personagens.keys()))
            fala_escolhida = random.choice(personagens[personagem_escolhido]['falas'])
            imagem_personagem = personagens[personagem_escolhido]['imagem']

            await message.channel.send(f'Adivinhe quem disse: "{fala_escolhida}"')

            def check(m):
                return m.content.startswith('!') and m.content[1:] == personagem_escolhido

            try:
                msg = await self.wait_for('message', check=check, timeout=30)
            except asyncio.TimeoutError:
                await message.channel.send(f'O tempo acabou! O personagem correto era **{personagem_escolhido}**.')
            else:
                await message.channel.send(f'Parabéns! {msg.author.mention}! Você acertou, o personagem correto era {personagem_escolhido}.')

                # Abrir a imagem com a biblioteca Pillow
                with Image.open(imagem_personagem) as img:
                    # Adicionar uma borda amarela à imagem
                    bordered_img = ImageOps.expand(img, border=2, fill='purple')

                    # Criar um buffer para armazenar a imagem
                    image_buffer = io.BytesIO()
                    bordered_img.save(image_buffer, format='JPEG')
                    image_buffer.seek(0)

                    # Criar o embed com a imagem como anexo
                    embed = discord.Embed(color=Color.gold())
                    embed.set_footer(text="BOT Desenvolvido por: Augusto Winkler")
                    embed.set_image(url="attachment://image.jpg")

                    # Enviar o embed com a imagem como anexo
                    await message.channel.send(embed=embed, file=discord.File(fp=image_buffer, filename="image.jpg"))

                    # Fechar a imagem e o buffer
                    bordered_img.close()
                    image_buffer.close()


client = MyClient(intents=intents)
client.run('Discord Token Aqui!')
