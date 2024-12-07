function gerarNumero(){
    var numeros = [];

    while (numeros.length < 6){
        let numero = Math.floor(Math.random() * 100);
        if (numeros.includes(numero)){
            let numero = Math.floor(Math.random() * 100);
        }
        else{numeros.push(numero)}
       
    }
    numeros.sort(function(a, b) {
        return a - b;
    });

    let exibir = document.getElementById('resultado')
    exibir.innerHTML = `${numeros}`
}