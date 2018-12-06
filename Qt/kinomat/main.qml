import QtQuick 2.11
import QtQuick.Controls 2.4

ApplicationWindow {
	id: window
	visible: true
	width: 600
	height: 400
	title: qsTr("Hello World")

	StackView {
		id: stackView
		initialItem: "HomePageForm.ui.qml"
		anchors.fill: parent
	}
}
