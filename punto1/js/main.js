var d = 0;
function setDistance(distance) {
    d = parseInt(distance);
}

var AirportJourney = function() {
    this.transport = "";
    this.distance = 0;
};

AirportJourney.prototype = {
    setStrategy: function(transport) {
        this.transport = transport;
    },

    setDistance: function(distance){
        this.distance = distance
    },

    calculate: function() {
        return this.transport.calculate(this.distance);
    }
};

var BYCICLE = function() {
    this.calculate = function(distance) {
        // calculations...
        var time = parseInt(distance) * 4; //Lets assume that the velocity its 15km/hr
        return "$0 COP tiempo:" + time.toString() + " minutos";
    }
};

var CAB = function() {
    this.calculate = function(distance) {
        // calculations...
        var time = parseInt(distance) * 2; //Lets assume that the velocity its 20km/hr
        var money = parseInt(distance) * 800;//Lets assume that it's 800 COP per Km
        return "$" + money.toString() +" COP tiempo:" + time.toString() + " minutos";
    }
};

var BUS = function() {
    this.calculate = function(distance) {
        // calculations...
        var time = parseInt(distance) * 3; //Lets assume that the velocity its 30km/hr
        return "$2300 COP tiempo:" + time.toString() + " minutos";
    }
};

// log helper

var log = (function() {
    var log = "";

    return {
        clear: function(){log = ""},
        add: function(msg) { log += msg + "\n"; },
        show: function() { alert(log); log = ""; }
    }
})();
function run(t) {

    // var temp = document.getElementById();
    // the 3 strategies

    var bycicle = new BYCICLE();
    var cab = new CAB();
    var bus = new BUS();

    // var AirportJourney = new AirportJourney();
    var airportJourney = new AirportJourney();


    if(d == 0){
        log.clear();
        log.add("Por favor selecciona una distancia");

    }else{

        airportJourney.setDistance(d);
        switch (parseInt(t)) {
            case 0:
                log.clear();
                airportJourney.setStrategy(bycicle);
                airportJourney.setDistance(d);
                log.add("En bicicleta: " + airportJourney.calculate());
                break;
            case 1:
                log.clear();
                airportJourney.setStrategy(cab);
                airportJourney.setDistance(d);
                log.add("En taxi: " + airportJourney.calculate());
                break;
            case 2:
                log.clear();
                airportJourney.setStrategy(bus);
                airportJourney.setDistance(d);
                log.add("En bus: " + airportJourney.calculate());
                break;
        }

    }
    log.show();
}