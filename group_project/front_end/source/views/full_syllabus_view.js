const FullSyllabus = function(){
}

FullSyllabus.prototype.render = function (week) {
  const ul = document.querySelector('#full_list');
  const li = document.createElement('li');
  const num = document.createElement('h3');
  const title = document.createElement('h3');
  const language = document.createElement('p');

  num.innerText = `Week: ${week.week_number}`;
  title.innerText = week.week_title;
  language.innerText = `language: ${week.language}`;

  li.appendChild(num);
  li.appendChild(title);
  li.appendChild(language);
  ul.appendChild(li);
};

module.exports = FullSyllabus;
