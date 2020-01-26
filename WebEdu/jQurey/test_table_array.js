

$(document).ready(function () {
    let data = {
        'member':
            [{ 'no': '1', 'name': '김지수' },
            { 'no': '2', 'name': '유영삼' },
            { 'no': '3', 'name': '김성민' },
            { 'no': '4', 'name': '이무권' }]
    };
    let bodyObj = $('body');
    bodyObj.append('<table id=\'tableMain\'></table>');
    bodyObj.append('<input type=\'text\' id=\'tableInput\'></input>');
    bodyObj.append('<button id=\'tableInputBtn\'>Add</button>');

    let tableObj = $('table#tableMain');
    let tableInputObj = $('#tableInput');
    let tableInputBtnObj = $('#tableInputBtn');

    let tableRowMake = function () {
        tableObj.append('<tr><td id=\'tableRowNo\'></td><td id=\'tableRowName\'></td></tr>');
        $('td').css({ 'border-bottom': '1px solid gray' });
        $('td#tableRowNo').css({ 'width': '50px' });
        $('td#tableRowName').css({ 'width': '200px' });
    };
    let tableRowDateInput = function (i) {
        $('td#tableRowNo:last').text(data.member[i].no);
        $('td#tableRowName:last').text(data.member[i].name);
    };



    tableRowMake();
    $('td#tableRowNo:last').text('No');
    $('td#tableRowName:last').text('Name');
    $('td').css({ 'background-color': 'lightBlue' });

    let i;
    for (i = 0; i < data.member.length; i++) {
        tableRowMake();
        tableRowDateInput(i);
    }

    tableInputBtnObj.click(function () {
        data.member.push({ 'no': data.member.length + 1, 'name': tableInputObj.val() });
        tableRowMake();
        tableRowDateInput(data.member.length - 1);
        tableInputObj.text = '';
    });
});


