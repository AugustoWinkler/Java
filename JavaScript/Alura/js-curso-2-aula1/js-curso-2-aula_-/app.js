let numeroLimite = 10;
let listaNumerosSorteados = []
let quantidadeElementosLista = listaNumerosSorteados.length;
let numeroSecreto = gerarNumeroAleatorio();
let tentativas = 1




function exibirTextoNaTela(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    responsiveVoice.speak(texto, 'Portuguese Female', {rate:1.2} );
}

function exibirMensagemInicial(){
    exibirTextoNaTela('h1','Jogo do Numero Secreto');
    exibirTextoNaTela('p','Escolha um número entre 1 e 10');

}
exibirMensagemInicial();

function verificarChute(){
    let chute = document.querySelector('input').value;
    console.log (chute == numeroSecreto);
    if (chute==numeroSecreto){
        exibirTextoNaTela('h1','Acertou!');
        let palavraTentativa = tentativas==1? 'tentativa' : 'tentativas'
        let mensagemTentativas = `Parabéns você descobriu o numero secreto com ${tentativas} ${palavraTentativa}`
        exibirTextoNaTela('p',mensagemTentativas);
        document.getElementById('reiniciar').removeAttribute('disabled');
    }else{
        if(chute>numeroSecreto){
            exibirTextoNaTela('p','O Número Secreto é menor');
        }else{
            exibirTextoNaTela('p','O Número Secreto é maior');
        }
    }
    tentativas++;
    limparCampo()

}
if(quantidadeElementosLista == numeroLimite){
    listaNumerosSorteados == []
}

function gerarNumeroAleatorio(){
    let numeroEscolhido = parseInt(Math.random()*numeroLimite+1);
    if (listaNumerosSorteados.includes(numeroEscolhido)){
        return gerarNumeroAleatorio();
    }else{
        listaNumerosSorteados.push(numeroEscolhido)
        console.log(listaNumerosSorteados)
        return numeroEscolhido
    }
}
function limparCampo(){
    chute=document.querySelector('input');
    chute.value = '';    
}
function reiniciarJogo(){
    numeroSecreto = gerarNumeroAleatorio();
    limparCampo();
    tentativas = 1;
    exibirMensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled',true);

}