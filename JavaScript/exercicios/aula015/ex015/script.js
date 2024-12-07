function contar(){
    let inicio = document.getElementById('txti')
    let fim = document.getElementById('txtf')
    let passo = document.getElementById('txtp')
    let res = document.getElementById('res')
    
    if (inicio.value.length == 0 || fim.value.length == 0 || passo.value.length == 0){
        res.innerHTML = 'Impossivel Contar!'
    }else{
        res.innerHTML = 'Contando:'
        var i = Number(inicio.value)
        var f = Number(fim.value)
        var p = Number(passo.value)

        if (p<=0){
            window.alert('Passo invalido')
            p = 1
        }
        if (i<f){ 
            // contagem crescente
            for(var c = i; c<=f;c+=p)
            res.innerHTML += `${c} \u{1F449}`
        }else{
            // contagem regresiva
            for(var c = i; c>=f;c-=p)
            res.innerHTML += `${c} \u{1F449}`
        }
       
    }
    res.innerHTML += `\u{1F3C1}`
}