$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/getBuddy"
    }).then(function(data) {
        $('.getBuddy-name').append(data.name);
        $('.getBuddy-phoneNumber').append(data.phoneNumber);
    });
});