const MapWrapper = require('../services/mapWrapper.js');

const MapPopUp = function(){

}

MapPopUp.prototype.populateView = function () {
  let mapDiv = document.querySelector('#mapPopUpMain');
  let center = { lat: 55.946613, lng: -3.203017 };
  let codeclan = { lat: 55.946962, lng: -3.201958 };
  let pub = { lat: 55.9458, lng: -3.2036 };
  let mainMap = new MapWrapper(mapDiv, center, 17);
  let pub1 = mainMap.addMarker(pub);
  let codeclan1 = mainMap.addMarker(codeclan);
  mainMap.addInfoBubble(pub1, "The Chanter");
  mainMap.addInfoBubble(codeclan1, "CodeClan");
};

MapPopUp.prototype.calculateRoute = function() {
  let directionsDisplay = new google.maps.DirectionsRenderer({
    suppressMarkers: true
  });
  let directionsService = new google.maps.DirectionsService();
  let mapDiv = document.querySelector('#mapPopUpMain');
  let center = { lat: 55.946613, lng: -3.203017 };
  let codeclan = { lat: 55.947149, lng: -3.201958 };
  let pub = { lat: 55.9458, lng: -3.2036 };
  let mainMap = new MapWrapper(mapDiv, center, 17);
  let pub1 = mainMap.addMarker(pub);
  let codeclan1 = mainMap.addMarker(codeclan);
  mainMap.addInfoBubble(pub1, "The Chanter");
  mainMap.addInfoBubble(codeclan1, "CodeClan");

  directionsDisplay.setMap(mainMap.googleMap);

  let journey = {
    origin: codeclan,
    destination: pub,
    travelMode: 'WALKING'
  };

  directionsService.route(journey, function(result, status) {
    if (status === "OK") {
      directionsDisplay.setDirections(result);
    }
  });
};

module.exports = MapPopUp;
