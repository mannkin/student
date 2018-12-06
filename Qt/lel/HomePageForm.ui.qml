import QtQuick 2.4

import QtQuick 2.11
import QtQuick.Controls 2.4

Page {
	id: page
	width: 600
	height: 400
	transformOrigin: Item.Center

	title: qsTr("Home")

	Rectangle {
		id: background
		x: 100
		y: -100
		width: 400
		height: 600
		color: "#ffffff"
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
	Label {
		y: 40
		width: 376
		height: 46
		color: "#e6370b"
		text: qsTr("CO CHCESZ ZROBIC")
		anchors.horizontalCenterOffset: 0
		anchors.horizontalCenter: parent.horizontalCenter
		font.pointSize: 30
		font.bold: true
		anchors.verticalCenterOffset: -133
		anchors.verticalCenter: parent.verticalCenter
	}

	Button {
		id: oneTime
		x: 100
		y: 147
		width: 220
		height: 40
		text: qsTr("KUP BILET JEDNORAZOWY")
		font.bold: true
		font.capitalization: Font.Capitalize
		font.family: "Ubuntu"
		anchors.verticalCenterOffset: -64
		anchors.horizontalCenterOffset: 0
		anchors.horizontalCenter: parent.horizontalCenter
		anchors.verticalCenter: parent.verticalCenter
		transformOrigin: Item.Center
		background: Rectangle {
			color: "#e8d329"
			border.color: "#4c4984"
			border.width: 6
			radius: 6
		}
	}

	Button {
		id: periodic
		x: 250
		y: 198
		width: 220
		height: 40
		text: qsTr("KUP BILET OKRESOWY")
		font.bold: true
		spacing: 4
		anchors.verticalCenterOffset: 1
		anchors.horizontalCenterOffset: 1
		anchors.horizontalCenter: parent.horizontalCenter
		anchors.verticalCenter: parent.verticalCenter
		background: Rectangle {
			color: "#e8d329"
			border.color: "#4c4984"
			border.width: 6
			radius: 6
		}
	}

	Button {
		id: repertoire
		x: 190
		y: 248
		width: 220
		height: 40
		text: qsTr("REPERTUAR")
		font.bold: true
		background: Rectangle {
			color: "#e8d329"
			border.color: "#4c4984"
			border.width: 6
			radius: 6
		}
	}
}
