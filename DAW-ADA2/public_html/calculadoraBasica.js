$(document).ready(inicio);

function inicio() {
    $("#btnSuma").click(sumar);
    $("#btnResta").click(restar);
    $("#btnRaiz").click(raizCuadrada);
    $("#btnMul").click(multiplicacion);
    $("#btnDiv").click(division);
    $("#btnEquis").click(divisionEntreEquis);
}
function sumar() {
    /*
    let x = parseFloat(document.getElementById('valor1').value);
    let y = parseFloat(document.getElementById('valor2').value);
    document.getElementById('resultado').innerHTML = x + y;
    */
    var x = $("#valor1").val();
    var y = $("#valor2").val();
    var r = parseFloat(x) + parseFloat(y);
    $("#resultado").val("r");
}

function restar() {
    /*
    let x = parseFloat(document.getElementById('valor1').value);
    let y = parseFloat(document.getElementById('valor2').value);
    document.getElementById('resultado').innerHTML = x - y;
    */
    var x = $("#valor1").val();
    var y = $("#valor2").val();
    var r = parseFloat(x) - parseFloat(y);
    $("#resultado").val("r");
}

function raizCuadrada() {
    //let x = parseFloat(document.getElementById('valor1').value);
    //document.getElementById('resultado').innerHTML = Math.sqrt(x);
    var x = parseFloat($("#valor1").val());
    var r = Math.sqrt(x);
    $("#resultado").val("r");

}

function multiplicacion() {
    /*
    let x = parseFloat(document.getElementById('valor1').value);
    let y = parseFloat(document.getElementById('valor2').value);
    document.getElementById('resultado').innerHTML = x * y;
    */
    var x = $("#valor1").val();
    var y = $("#valor2").val();
    var r = parseFloat(x) * parseFloat(y);
    $("#resultado").val("r");
}

function division() {
    /*
    let x = parseFloat(document.getElementById('valor1').value);
    let y = parseFloat(document.getElementById('valor2').value);
    */
    var x = $("#valor1").val();
    var y = $("#valor2").val();
    if (y !== 0) {
        var r = parseFloat(x) / parseFloat(y);
        $("#resultado").val(r);
    } else {
        alert("No puedes dividir entre 0.");
    }
}

function divisionEntreEquis() {
    //let x = parseFloat(document.getElementById('valor1').value);
     var x = parseFloat(($("#valor1").val()));
    if (x !== 0) {
        var r = 1.0 / x;
        $("#resultado").val(r);
    } else {
        alert("No puedes dividir entre 0.");
    }
}

function buscar() {
    let busqueda = document.getElementById('formBusqueda').value;
    if(busqueda !== ''){
        console.log(busqueda);
    } else {
        alert("El espacio de busqueda está en blanco.");
    }
}