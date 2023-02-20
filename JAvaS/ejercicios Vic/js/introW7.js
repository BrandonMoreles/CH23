let butName=document.getElementById('butName')
let writeName=document.getElementById('writeName')
let changeName=()=>{
    let name=document.getElementById('insertName').value
    name=name.trim()
    let txt=name.length>0?"Hola  "+name:"Capo, haz las cosa bien"
    writeName.innerHTML=txt
}
butName.addEventListener('click', changeName)


let butInfo=document.querySelector('.butInfo')
let butInfos=document.querySelector('.butInfos')
let butInfoz=document.querySelector('.butInfoz')
let info=()=>{
    let text=event.target.name
    alert(text)
}
butInfo.addEventListener("click", info)
butInfos.addEventListener("click", info)
butInfoz.addEventListener("click", info)
