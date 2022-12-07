function deleteClient(){
    var xhr = new XMLHttpRequest();

    var body = JSON.stringify({
        id: ID
    });

    xhr.open("DELETE", '/api/client', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
            if (xhr.readyState == 4 && xhr.status == "201") {
                    window.location.href = "";
            }
    };

    xhr.send(body);
}
var ID = 0;

function setId(id){
    ID = id;
}