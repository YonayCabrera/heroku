var url = 'https://heroku-hello-world-heroku.herokuapp.com';
$.getJSON(url + '/hello', function (response) {
    $('#hello-message').text(response.message);
});