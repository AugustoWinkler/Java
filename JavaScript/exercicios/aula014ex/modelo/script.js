function verificar(){
    var data = new Date
    var ano = data.getFullYear()
    var fAno = document.getElementById('txtano')
    var res = document.getElementById('res')
    if (fAno.value.lenght == 0 || Number(fAno.value) > ano){
        window.alert('Verifique os Dados e tente novamente!')
    }else{
        var fsex = document.getElementsByName('radsex')
        var idade = Number(ano - fAno.value)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')
        if (fsex[0].checked){
            genero = 'Homem'
            if (idade>=0 && idade<10){
                img.setAttribute('src', 'imagens/criançaM.png')

            }else if (idade<21){
                img.setAttribute('src', 'imagens/jovemM.png')

            }else if (idade<50){
                img.setAttribute('src', 'imagens/adultoM.png')

            }else{
                img.setAttribute('src', 'imagens/velhoM.png')

            }
        }else if(fsex[1].checked){
            genero = 'Mulher'
            if (idade>=0 && idade<10){
                img.setAttribute('src', 'imagens/criançaF.png')

            }else if (idade<21){
                img.setAttribute('src', 'imagens/jovemF.png')

            }else if (idade<50){
                img.setAttribute('src', 'imagens/adultoF.png')

            }else{
                img.setAttribute('src', 'imagens/velhoF.png')
                
            }
        }
        res.style.textAlign = 'center'
        res.innerHTML= `Detectamos ${genero} com ${idade} anos`
        res.appendChild(img)
    }
}