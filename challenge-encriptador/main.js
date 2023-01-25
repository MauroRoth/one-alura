function remplazo (frase,v){
    let frase2=frase;
    for(let i=0;i<v.length;i+=2){frase2=frase2.replace(v[i],v[i+1]);} 
    return(frase2);
}
document.getElementsByClassName('btn-encriptar')[0].addEventListener('click', function(){
    let frase = document.getElementsByClassName('text-area')[0].value; 
    let v=[/e/img,'enter',/o/img,'ober',/i/img,'imes',/a/img,'ai',/u/img,'ufat'];
    document.querySelector('.mensaje').style.background= 'white';
    document.getElementsByClassName('mensaje')[0].innerHTML = remplazo(frase,v); 
})
document.getElementsByClassName('btn-desencriptar')[0].addEventListener('click', function(){
    let frase = document.getElementsByClassName('text-area')[0].value;
    let v=[/enter/img,'e',/ober/img,'o',/imes/img,'i',/ai/img,'a',/ufat/img,'u']; 
    document.querySelector('.mensaje').style.background= 'white';
    document.getElementsByClassName('mensaje')[0].innerHTML = remplazo(frase,v);
})
document.getElementsByClassName('copiar')[0].addEventListener('click', function(){
    navigator.clipboard
        .writeText(document.getElementsByClassName('mensaje')[0].value)
        .then(()=>alert('Texto Copiado'));
})


