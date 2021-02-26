$(document).ready(function() {
    $.ajax({
        url: "https://addressbook-gciolac.herokuapp.com/getBuddy"
    }).then(function(data) {
        $('.getBuddy-name').append(data.name);
        $('.getBuddy-phoneNumber').append(data.phoneNumber);
    });
});