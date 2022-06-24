let itemList = [];

let addBtn = document.getElementById("add");

// addBtn.onclick = addList;
addBtn.addEventListener("click", addList);

function addList(){
    let item = document.getElementById("item").value;
    itemList.push(item);
    document.getElementById("item").value = ""; //아이템 초기화
    document.getElementById("item").focus(); //커서 위치

    console.log(itemList);
    showList();
}
function showList(){
    let list = "<ul>";
 
    for(var i = 0; i < itemList.length; i++){
    /* document.getElementById("itemList")
    .innerHTML = itemList[i]; */
    list += "<li>" + itemList[i] + "<span class='close' id=' + i + '>X</li>";
    }
    list += "</ul>";
    document.getElementById("itemList").innerHTML = list;


//아이템 삭제

let removeList = document.querySelectorAll(".close");

for(var i = 0; i < removeList.length; i++){
    removeList[i].addEventListener("click", remove);
}
}
function remove(){
    console.log(this);
    let id = this.getAttribute("id");
    itemList.splice(id, 1);

    showList();
}