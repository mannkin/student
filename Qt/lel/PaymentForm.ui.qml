import QtQuick 2.4

import QtQuick 2.11
import QtQuick.Controls 2.4

Page {
	id: page
	width: 600
	height: 400
	transformOrigin: Item.Center

	title: qsTr("Payment")

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
		width: 376
		height: 46
		color: "#e6370b"
		text: qsTr("ZBLIZ LUB WLOZ KARTE DO TERMINALA")
		horizontalAlignment: Text.AlignHCenter
		wrapMode: Text.WordWrap
		anchors.verticalCenterOffset: -47
		anchors.horizontalCenter: parent.horizontalCenter
		anchors.verticalCenter: parent.verticalCenter
		anchors.horizontalCenterOffset: 0
		font.pointSize: 30
		font.bold: true
	}
}
