var studentList = [];
var studentListJSON;

class Helper {

	constructor() {
	}

	addStudent() {
		var newStudent = JSON.parse(document.getElementById("myForm").elements[0].value);
		this.studentList.push(newStudent);
		var info = '<b>Lista studentow</b><br />';
		for (var i=0; i < this.studentList.length; i++) {
			info = info + this.studentList[i].first_name + " " + this.studentList[i].last_name + "<br />";
		}
		document.getElementById("studentList").innerHTML = info;
		console.log(newStudent);
	}

	addJSON() {
		var files = document.getElementById('selectJSON').files;
		console.log(files);
		if(files.length <= 0) {
			return false;
		}
		var fr = new FileReader();
		fr.onload = function(e) {
			studentListJSON = e.target.result;
		};
		fr.readAsText(files.item(0));
	}

	getStudentList(studentObjs) {
		var list = [];
		var JSONStudents = JSON.parse(studentObjs);
		list = list.concat(JSONStudents);
		list = this._sortByName(list);
		return list;
	}

	getStudentListForCourse(studentObjs,year,courseName) {
		var studentListForCourse = [];
		for (var y in studentList) {
			var coursesYear = y.courses;
			for (var z in coursesYear) {
				if(z == year) {
					var courses = z;
					for (var w = 0; w < courses.length; w++) {
						if(courses[w] == courseName) {
							studentListForCourse.push(y);
						}
					}
				}
			}
		}
		studentListForCourse = this._sortByName(studentListForCourse);
		return studentListForCourse;
	}

	getAvarageForStudentInYear(studentObj,year) {
		var averageGrade = 0.0;
		var numberOfGrades = 0;
		for(var name in studentObj.courses) {
			if(name == year) {
				var len10 = name.length;
				var value = studentObj.courses[name];
				var len20 = value.length;
				for (var name1 in value){
					var len11 = name1.length;
					var value1 = value[name1];     
					var len21 = value1.length;
					for (var name2 in value1){
						var len12 = name2.length;
						var value2 = value1[name2];
						var len22 = value2.length;
						for (var name3 in value2){
							var len13 = name3.length;
							var value3 = value2[name3];   
							var len23 = value3.length;
							for (var i=0; i<len23; i++){
								averageGrade += value3[i];
								numberOfGrades++;
							}
						}
					}
				}
			}
		}
		return this._getAverage(averageGrade,numberOfGrades);
	}

	getAvarageForStudentAllYears(studentObj) {
		var averageGrade = 0.0;
		var numberOfGrades = 0;
		for(var name in studentObj.courses) {
			var len10 = name.length;
			var value = studentObj.courses[name];
			var len20 = value.length;
			for(var name1 in value){
				var len11 = name1.length;
				var value1 = value[name1];     
				var len21 = value1.length;
				for(var name2 in value1){
					var len12 = name2.length;
					var value2 = value1[name2];
					var len22 = value2.length;
					for(var name3 in value2){
						var len13 = name3.length;
						var value3 = value2[name3];   
						var len23 = value3.length;
						for(var i=0; i<len23; i++){
							averageGrade += value3[i];
							numberOfGrades++;
						}
					}
				}
			}
		}
		return this._getAverage(averageGrade,numberOfGrades);
	}

	getAverageForCourse(studentObjs,year,courseName) {
		var averageGrade = 0.0;
		var numberOfGrades = 0;
		for (var name in studentObjs.courses) {
			if(name == year) {
				var len10 = name.length;
				var value = studentObj.courses[name];
				var len20 = value.length;
				for (var name1 in value){
					if(name1 == courseName) {
						var len11 = name1.length;
						var value1 = value[name1];     
						var len21 = value1.length;
						for (var name2 in value1){
							var len12 = name2.length;
							var value2 = value1[name2];
							var len22 = value2.length;
							for (var name3 in value2){
								var len13 = name3.length;
								var value3 = value2[name3];   
								var len23 = value3.length;
								for (var i=0; i<len23; i++){
									averageGrade += value3[i];
									numberOfGrades++;
								}
							}
						}
					}
				}
			}
		}
		return this._getAverage(averageGrade,numberOfGrades);
	}

	_getAverage(a,b) {
		return a/b;
	}

	_compare(a,b) {
		if(a.last_name < b.last_name)
			return -1;
		if(a.last_name > b.last_name)
			return 1;
		return 0;
	}

	_sortByName(studentList) {
		studentListSorted = studentList.sort(_compare);
		return studentListSorted;
	}
}
