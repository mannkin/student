import QtQuick 2.4

import QtQuick 2.11
import QtQuick.Controls 2.4

Page {
	id: page
	width: 600
	height: 400
	transformOrigin: Item.Center

	title: qsTr("PeriodicTicket")

	Rectangle {
		id: background
		x: 100
		y: -100
		width: 400
		height: 600
		color: "#ffffff"
		border.width: 0
		border.color: "#dddde2"
		visible: true
		clip: false
		rotation: 270
		gradient: Gradient {
			GradientStop {
				position: 0.0
				color: "#0F2027"
			}
			GradientStop {
				position: 0.5
				color: "#203A43"
			}
			GradientStop {
				position: 1.0
				color: "#2C5364"
			}
		}
	}

	Rectangle {
		id: oneMonth
		x: 37
		y: 100
		width: 150
		height: 200
		color: "#4caac5"
		radius: 6
		transformOrigin: Item.Left
		anchors.verticalCenter: parent.verticalCenter
		Rectangle {
			id: rectangle1
			height: 59
			color: "#e8d329"
			radius: 6
			anchors.right: parent.right
			Label {
				id: label3
				x: 47
				y: 21
				text: qsTr("MIESIAC")
			}
			border.color: "#4c4984"
			anchors.left: parent.left
			border.width: 6
			anchors.top: parent.top
		}

		Label {
			id: label4
			x: 55
			y: 85
			text: qsTr("CENA")
		}

		Label {
			id: label5
			x: 50
			y: 136
			text: qsTr("GRATIS")
		}

		MouseArea {
			id: mouseArea
			anchors.fill: parent
		}
		border.color: "#4c4984"
		border.width: 6
	}

	Rectangle {
		id: halfYear
		x: 225
		y: 100
		width: 150
		height: 200
		color: "#4caac5"
		radius: 6
		anchors.verticalCenter: parent.verticalCenter
		anchors.horizontalCenter: parent.horizontalCenter
		border.width: 6
		border.color: "#4c4984"

		Rectangle {
			id: rectangle
			height: 59
			color: "#e8d329"
			radius: 6
			border.color: "#4c4984"
			border.width: 6
			anchors.right: parent.right
			anchors.left: parent.left
			anchors.top: parent.top

			Label {
				id: label
				x: 39
				y: 21
				text: qsTr("POL ROKU")
			}
		}

		Label {
			id: label1
			x: 55
			y: 85
			text: qsTr("CENA")
		}

		Label {
			id: label2
			x: 50
			y: 136
			text: qsTr("GRATIS")
		}

		MouseArea {
			id: mouseArea1
			anchors.fill: parent
		}
	}

	Rectangle {
		id: year
		x: 414
		y: 100
		width: 150
		height: 200
		color: "#4caac5"
		radius: 6
		transformOrigin: Item.Right
		anchors.verticalCenter: parent.verticalCenter
		Rectangle {
			id: rectangle2
			height: 59
			color: "#e8d329"
			radius: 6
			anchors.right: parent.right
			Label {
				id: label6
				x: 59
				y: 21
				text: qsTr("ROK")
			}
			border.color: "#4c4984"
			anchors.left: parent.left
			border.width: 6
			anchors.top: parent.top
		}

		Label {
			id: label7
			x: 55
			y: 85
			text: qsTr("CENA")
		}

		Label {
			id: label8
			x: 50
			y: 136
			text: qsTr("GRATIS")
		}

		MouseArea {
			id: mouseArea2
			anchors.fill: parent
		}
		border.color: "#4c4984"
		border.width: 6
	}

	Label {
		id: label9
		x: 150
		y: 40
		text: qsTr("WYBIERZ PLAN")
		font.pointSize: 30
		font.bold: true
		color: "#e6370b"
	}
}


/*##^## Designer {
	D{i:19;anchors_height:200;anchors_width:200;anchors_x:15;anchors_y:24}D{i:14;anchors_height:200;anchors_width:200;anchors_x:15;anchors_y:24}
D{i:24;anchors_height:200;anchors_width:200;anchors_x:15;anchors_y:24}
}
 ##^##*/
