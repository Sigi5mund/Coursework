const FullSyllabus = require('./views/full_syllabus_view');
const ColumnView = require('./views/columns_view.js');
const Request = require('./services/request');
const MapWrapper = require('./services/mapWrapper.js');
const DateView = require('./views/date_view');
const DisplayEvents = require('./views/display_events_view.js');
const Cohorts = require('./models/cohorts.js');
const MapPopUp = require('./views/map_popup_view.js')
const _ = require('lodash');

const syllabusRequest = new Request('http://localhost:5000/api/syllabus/');
const externalEventsRequest = new Request('http://localhost:3000/api/events');
const internalEventRequest = new Request('http://localhost:5000/api/events/');
const fullSyllabus = new FullSyllabus();
const displayEvents = new DisplayEvents();
const columnConstruct = new ColumnView();
const dateView = new DateView();
const cohorts = new Cohorts();
const mapPopUp = new MapPopUp();


const syllabusButtonClicked = function(){
  let popupDiv = document.querySelector("#popup_bg");
  popupDiv.style.display = 'block';
};

const pdaButtonClicked = function(){
  window.open("https://github.com/codeclan/pda");
};

const closePopup = function(){
  let popupDiv = document.querySelector("#popup_bg");
  popupDiv.style.display = 'none';
};

const closeMap = function(){
  let mapPopUpDiv = document.querySelector("#mappopup_bg");
  mapPopUpDiv.style.display = 'none';
};

const pubMapPopup = function(){
  mapPopUp.calculateRoute();
  let pubPopup = document.querySelector('#mappopup_bg');
  pubPopup.style.display = 'block';
};

const allColumnsConstructed = function(wholeSyllabus){
  cohorts.populate();
  columnConstruct.renderColumn(cohorts, wholeSyllabus);
};

const getFullSyllabusComplete = function(allSyllabus){
  allSyllabus.forEach(function(week){
    fullSyllabus.render(week);
  });
};

const displayEventsTech = function(info){
  let infoParsed = _.uniqBy(info.data, obj => [obj.summaryDisplay, obj.start.timestamp].join());
  displayEvents.renderExternal(infoParsed);
};

const displayEventsInternal = function(events){
  displayEvents.renderInternal(events);
};

const app = function() {
  const syllabusButton = document.querySelector('#full-details');
  const closeSyllabusClicked = document.querySelector("#close_popup");
  const closeMapClicked = document.querySelector("#close_mappopup");
  const pdaButton = document.querySelector('#PDA');
  const pubsButtonClicked = document.querySelector('#pubs');

  pdaButton.addEventListener('click', pdaButtonClicked);
  syllabusButton.addEventListener('click', syllabusButtonClicked);
  closeSyllabusClicked.addEventListener('click', closePopup);
  closeMapClicked.addEventListener('click', closeMap);
  pubsButtonClicked.addEventListener('click', pubMapPopup);

  syllabusRequest.get(getFullSyllabusComplete);
  syllabusRequest.get(allColumnsConstructed);
  externalEventsRequest.get(displayEventsTech);
  internalEventRequest.get(displayEventsInternal);
  dateView.dynamicDate();
};

document.addEventListener("DOMContentLoaded", app);
