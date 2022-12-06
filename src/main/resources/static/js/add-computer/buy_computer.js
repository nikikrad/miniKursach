function buyComputer(){
    var xhr = new XMLHttpRequest();
    var xhrDelete = new XMLHttpRequest();

    var name = document.getElementById('name');
    var phone = document.getElementById('phone');

    var body = JSON.stringify({
        name: name.value,
        phone_number: phone.value,
        price: PRICE
    });

    var bodyDelete = JSON.stringify({
        id: ID
    });


    xhr.open("POST", '/api/client', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
            if (xhr.readyState == 4 && xhr.status == "201") {
                    window.location.href = "";
            }
    };

    xhrDelete.open("DELETE", '/api/computer', true);
    xhrDelete.setRequestHeader('Content-Type', 'application/json');
    xhrDelete.onload = function () {
       if (xhrDelete.readyState == 4 && xhrDelete.status == "201") {
            window.location.href = "";
       }
    };

    xhr.send(body);
    xhrDelete.send(bodyDelete);
}
var ID = 0;
var PRICE = 0;

 function setId(id, price){
    ID = id;
    PRICE = price
 }
