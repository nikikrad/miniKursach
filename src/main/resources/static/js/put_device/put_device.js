function putDevice(){
    var xhr = new XMLHttpRequest();

    var device_name = document.getElementById('device_name');
    var groupy_device = document.getElementById('groupy_device');
    var device_price = document.getElementById('device_price');

    var body = JSON.stringify({
        id : ID,
        name_device: device_name.value,
        groupy: groupy_device.value,
        price: device_price.value
    });

    xhr.open("PUT", '/api/devices', true);
    xhr.setRequestHeader('Content-Type', 'application/json');
    xhr.onload = function () {
            if (xhr.readyState == 4 && xhr.status == "201") {
                    window.location.href = "";
            }
    };

    xhr.send(body);
}
var ID = 0;

 function setDeviceId(id){
    ID = id;
 }
