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
        text: qsTr("WPISZ SWOJE DANE")
        anchors.horizontalCenterOffset: 0
        anchors.horizontalCenter: parent.horizontalCenter
        font.pointSize: 30
        font.bold: true
        anchors.verticalCenterOffset: -133
        anchors.verticalCenter: parent.verticalCenter
    }

    TextField {
        id: firstName
        x: 35
        y: 135
        placeholderText: qsTr("Imie")
    }

    TextField {
        id: lastName
        x: 35
        y: 232
        placeholderText: qsTr("Nazwisko")
    }

    TextField {
        id: email
        x: 267
        y: 135
        placeholderText: qsTr("Email")
    }

    TextField {
        id: birthDate
        x: 267
        y: 232
        placeholderText: qsTr("Data urodzenia w formacie DD/MM/RRRR")
    }

    Button {
        id: oneTime
        x: 148
        y: 431
        width: 220
        height: 40
        text: qsTr("PRZEJDZ DO PLATNOSCI")
        anchors.horizontalCenterOffset: 0
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenterOffset: 137
        font.capitalization: Font.Capitalize
        transformOrigin: Item.Center
        font.family: "Ubuntu"
        anchors.verticalCenter: parent.verticalCenter
        font.bold: true
        background: Rectangle {
            color: "#e8d329"
            radius: 6
            border.color: "#4c4984"
            border.width: 6
        }
    }
}
