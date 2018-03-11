var MapWrapper = function(container, coords, zoom){
  this.googleMap = new google.maps.Map(container,
    {
      center: coords,
      zoom: zoom,

  });

  this.markers =[];
}

counter = 0;

MapWrapper.prototype.centerOn = function(){
  this.googleMap.mapTypeId = google.maps.MapTypeId.HYBRID
  this.googleMap.setCenter({
    lat: 40.058553,
    lng: 22.554867
  })
  this.googleMap.setZoom(20);
}


MapWrapper.prototype.centerOnMe = function(){
navigator.geolocation.getCurrentPosition(function (position) {
  var center = { lat: position.coords.latitude, lng: position.coords.longitude };
  this.googleMap.setCenter(center);
  this.addMarker(center);
}.bind(this));
}




MapWrapper.prototype.addMarker= function (coords) {
  counter ++;
  var marker = new google.maps.Marker({
    position: coords,
    map: this.googleMap
  })
  this.markers.push(marker);

  var infowindow = new google.maps.InfoWindow({
    content: `${counter}`
  });

  marker.addListener('click', function() {
    infowindow.open(this.googleMap, marker);
  });
};

MapWrapper.prototype.bounceMarkers =  function () {
  this.markers.forEach(function(marker){
    marker.setAnimation(google.maps.Animation.BOUNCE)
  })
};

MapWrapper.prototype.addClickEvent = function(){
  google.maps.event.addListener(this.googleMap, 'click', function(event){
    var newCoords = {lat: event.latLng.lat(), lng: event.latLng.lng()}
    this.addMarker(newCoords);
  }.bind(this))
}
