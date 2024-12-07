alert('Boas Vindas ao jogo do número secreto!');
let dificuldade = 100
let numeroSecreto = parseInt(Math.random()*dificuldade + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;


while(chute!=numeroSecreto){
    chute = prompt(`Escolha um número entre 1 e ${dificuldade}`);
    if (chute==numeroSecreto){
        break;
    }
    else{
        if(chute<numeroSecreto){
            alert(`O Número Secreto é maior que ${chute}`);
        }else{
            alert(`O Numero Secreto é menor que ${chute}`);
        }
        tentativas++
    }    
}
let palavraTentativa = tentativas>1 ? 'tentativas' : 'tentativa';
alert(`Isso ai você acertou o numero secreto! ${numeroSecreto} com ${tentativas} ${palavraTentativa}`);




