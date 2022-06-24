var selectMenu = document.testForm.major;

function displaySelect(){
        // select option속성의 인덱스로 선택
        /* let selectText = selectMenu.options[selectMenu.selectedIndex].innerText; //텍스트 출력
        alert(selectText + "가 선택되었습니다."); */

        //id 선택자로 처리
        var selectText = document.getElementById("subj").value; //value값 출력
        alert(selectText + "가 선택되었습니다.");
    }
