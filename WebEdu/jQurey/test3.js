// $(document).ready(function () {
//     let bodyObj = $("body");
//     let barText = function () {
//         bodyObj.append("<br /><div id=\'bar\'>================================================</div>");
//     };

//     let handleDrop = function (event) {
//         event.preventDefault();
//         var src = event.dataTransfer.getData("Text");
//         event.target.appendChild(document.getElementById(src));
//     };

//     let handleDragStart = function (event) {
//         event.dataTransfer.effectAllowed = 'move';
//         event.dataTransfer.setData("Text", event.target.id);
//     }
//     let allowDrop = function (event) { event.preventDefault(); };

//     //cssEchoButton
//     barText();
//     bodyObj.append('<div id=\'dragCartIn\'></div>');
//     bodyObj.append('<div id=\'dragCartOut\'></div>');
//     bodyObj.append('<img id=\'img1\' src=./image/tv.png></img>');
//     bodyObj.append('<img id=\'img2\' src=./image/tv.png></img>');

//     let dragCartInObj = $('div#dragCartIn');
//     let dragCartOutObj = $('div#dragCartOut');
//     let img1Obj = $('img#img1');
//     let img2Obj = $('img#img2');

//     dragCartInObj.css({ 'width': '500px', 'height': '200px', 'border': '2px dotted red' });
//     dragCartInObj.on('drop', handleDrop);
//     dragCartInObj.on('dragover', allowDrop);
//     dragCartOutObj.css({ 'width': '500px', 'height': '200px', 'border': '2px dotted red' });
//     dragCartOutObj.on('drop', handleDrop);
//     dragCartOutObj.on('dragover', allowDrop);
//     img1Obj.css({ 'width': '120px', 'height': '100px', 'draggable': 'true' });
//     img1Obj.on('dragstart', handleDragStart);
//     img2Obj.css({ 'width': '120px', 'height': '100px', 'draggable': 'true' });
//     img2Obj.on('dragstart', handleDragStart);


// });