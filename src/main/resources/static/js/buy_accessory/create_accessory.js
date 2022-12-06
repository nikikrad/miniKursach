function createAccessory(){
    var xhr = new XMLHttpRequest();

    var name = document.getElementById('name_device');
    var groupy = document.getElementById('groupy');
    var price = document.getElementById('secondPrice');

    var body = JSON.stringify({
        name_device: name.value,
        groupy: groupy.value,
        price: price.value
    });


    xhr.open("POST", '/api/devices', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
            if (xhr.readyState == 4 && xhr.status == "201") {
                    window.location.href = "";
            }
    };

    xhr.send(body);
}