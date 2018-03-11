var initialize =function(){
  var container = document.getElementById('main-map');
  var center = { lat: 51.507351, lng: -0.127758};
  var mainMap = new MapWrapper(container, center, 10);
  mainMap.addMarker(center);
  // mainMap.addMarker({lat: 51.528490, lng: -0.084728});
  mainMap.addClickEvent();
  var bounceButton = document.querySelector('#button-bounce-markers');
  bounceButton.addEventListener('click', mainMap.bounceMarkers.bind(mainMap));
  var takeMeToButton = document.querySelector('#take-me-too');
  takeMeToButton.addEventListener('click', mainMap.centerOn.bind(mainMap));
  var takeMeToButton = document.querySelector('#find-me');
  takeMeToButton.addEventListener('click', mainMap.centerOnMe.bind(mainMap));

}




window.addEventListener('load', initialize);
