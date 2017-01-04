$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/subjects"
    }).then(function(data, status, jqxhr) {
       $('.subjects-id').append(data.id);
       $('.subjects-content').append(data.content);
       console.log(jqxhr);
    });
});