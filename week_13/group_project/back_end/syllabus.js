use codeclan_dashboard;

db.dropDatabase();

db.syllabus.insert({
  week_number: 1,
  week_title: "Intro to programming",
  language: "Ruby",
  day1: "Induction \n Intro to course structure \n Classroom culture \n Unix basics \n Git",
  day2: "Git review \n What is programming? \n Ruby conditionals \n Ruby functions \n Ruby testing \n Ruby functions TDD \n Intro to pair programming",
  day3: "Ruby arrays \n Ruby hashes \n Ruby loops \n Using loops in functions",
  day4: "Review \n TDD Fizzbuzz \n Effective text editing \n Ruby debugging \n Friends lab",
  day5: "Homework - Pet shop"
});

db.syllabus.insert({
  week_number: 2,
  week_title: "OO in Ruby",
  language: "Ruby",
  day1: "Introduction to classes pt1 \n Introduction to classes pt2 \n Lab (single classes)",
  day2: "Intro to diagrams \n Multiple classes \n Bus lab",
  day3: "Paired lab \n Paired lab presentations \n Diagrams",
  day4: "Blocks and enumeration \n Pry \n Inheritance \n Inheritance minilab",
  day5: "Homework - Codeclan Caraoke"
});

db.syllabus.insert({
  week_number: 3,
  week_title: "SQL",
  language: "SQL",
  day1: "Intro to SQL \n Associations intro \n Zombies lab",
  day2: "Pizza shop code along \n Bounty hunters lab",
  day3: "Associations and association diagrams \n Extending pizza shop \n Music library lab",
  day4: "SQL inner joins intro \n Associations - many to many",
  day5: "Homework - Codeclan Caraoke"
});

db.syllabus.insert({
  week_number: 4,
  week_title: "Sinatra",
  language: "Ruby",
  day1: "UX presentation by Wojtek",
  day2: "Planning/PDA lesson \n Web programming intro and MVC",
  day3: "First app (Sinatra intro) \n Sinatra calculator",
  day4: "Student enrolment lab \n Many to many Sinatra app codebase",
  day5: "Projects!"
});

db.syllabus.insert({
  week_number: 5,
  week_title: "Ruby project",
  language: "Ruby",
  day1: "Project",
  day2: "Project",
  day3: "Project",
  day4: "Project",
  day5: "PRESENTATIONS"
});

db.syllabus.insert({
  week_number: 6,
  week_title: "Java",
  language: "Java",
  day1: "Intro to Java/IDEs \n Single classes & encapsulation \n Types \n ArrayLists \n Loops & Conditionals \n Eightball lab",
  day2: "Multiple classes \n Buses lab \n Hashmaps \n Enums \n Quiz",
  day3: "All day lab \n Generics lesson",
  day4: "Generics lab \n Inheritance \n Packages & access modifiers \n Try/Catch \n Employee lab",
  day5: "Weekend homework"
});

db.syllabus.insert({
  week_number: 7,
  week_title: "Java",
  language: "Java",
  day1: "Abstract Classes \n nterfaces \n Stereo system lab",
  day2: "Polymorphism \n Polymorphism lab \n Composition \n Composition lab",
  day3: "Adventure time lab",
  day4: "SOLID review \n SOLID lab \n Intro to Android \n Robot Android exercise",
  day5: "Weekend homework - Music shop"
});

db.syllabus.insert({
  week_number: 8,
  week_title: "Android",
  language: "Java + Android",
  day1: "Basic android app \n Adding controls \n Deployment \n Word counter lab",
  day2: "Activities and intents \n Custom Listview Adapters",
  day3: "Rock papes scissors lab",
  day4: "Data persistence \n Menu \n Movies ranking lab",
  day5: "Project time!"
});

db.syllabus.insert({
  week_number: 9,
  week_title: "Java/Android project",
  language: "Java + Android",
  day1: "Project",
  day2: "Project",
  day3: "Project",
  day4: "Project",
  day5: "PRESENTATION"
});

db.syllabus.insert({
  week_number: 10,
  week_title: "CS",
  language: "CS and CV",
  day1: "Algorithms \n CV/PDA \n IT Industry Landscape \n CV/BIO workshop",
  day2: "Data Structures \n Brand of ME",
  day3: "Technical Testing and CV's \n Parallel Programming",
  day4: "Interview Skills Workshop",
  day5: "PDA Test \n CV Reviews \n Mock Interviews"
});

db.syllabus.insert({
  week_number: 11,
  week_title: "JS Foundations",
  language: "JavaScript",
  day1: "JS Intro - Fundamentals \n Functions, Scope, Let & Const",
  day2: "Objects and Constructor Functions \n Prototypal Inheritance \n Water Bottle TDD \n OO Bank",
  day3: "Intro to callbacks \n Enumeration",
  day5: "NPM recap"
 });

db.syllabus.insert({
  week_number: 12,
  week_title: "JS in the Browser",
  language: "JavaScript",
  day1: "Browser JS intro \n DOM review \n Reading the DOM \n Writing the DOM",
  day2: "Event Listeners \n Local storage \n Todo app Lab \n Google Maps intro",
  day3: "JS Requests \n Git Branching \n Countries pair lab",
  day4: "Canvas \n Charts",
  day5: "PDA lesson"
});

db.syllabus.insert({
  week_number: 13,
  week_title: "JS Full-stack",
  language: "JavaScript",
  day1: "Intro to Express \n Express REST \n Webpack",
  day2: "Intro to Mongo \n Serve up API from DB",
  day3: "Event Loop Video \n Practical GitHub \n Bucket List all day Lab",
  day4: "What is Scrum? \n Hand out Group Projects",
  day5: "Group Projects"
});

db.syllabus.insert({
  week_number: 14,
  week_title: "Group Project",
  language: "Group Project",
  day1: "Group Project",
  day2: "Group Project",
  day3: "Group Project",
  day4: "PRESENTATIONS",
  day5: "Speed Networking"
});

db.syllabus.insert({
  week_number: 15,
  week_title: "React",
  language: "React",
  day1: "ES6 intro \n Frameworks Introduction \n React Intro, React Hello World, React Piggy Bank \n React Comments",
  day2: "Add a form to React comments \n React Lifecycle \n React countries \n API pair lab",
  day3: "Quiz \n Tic Tac Toe all day lab",
  day4: "React Router \n Socket.io \n Socket lab",
  day5: "Mock Interviews"

});

db.syllabus.insert({
  week_number: 16,
  week_title: "Final Project",
  language: "Free Choice",
  day1: "Project",
  day2: "Project",
  day3: "Project",
  day4: "Project",
  day5: "GRADUATION"
});
