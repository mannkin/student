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
        text: qsTr("WYBIERZ KRYTERIUM WYSZUKIWANIA")
        horizontalAlignment: Text.AlignHCenter
        wrapMode: Text.WordWrap
        anchors.verticalCenterOffset: -147
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenter: parent.verticalCenter
        anchors.horizontalCenterOffset: 0
        font.pointSize: 30
        font.bold: true
    }

    Button {
        id: oneTime
        x: 148
        y: 431
        width: 220
        height: 40
        text: qsTr("KONKRETNY TYTUL")
        anchors.horizontalCenterOffset: 0
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenterOffset: 0
        font.capitalization: Font.Capitalize
        font.family: "Ubuntu"
        transformOrigin: Item.Center
        anchors.verticalCenter: parent.verticalCenter
        font.bold: true
        background: Rectangle {
            color: "#e8d329"
            radius: 6
            border.color: "#4c4984"
            border.width: 6
        }
    }

    Button {
        id: oneTime1
        x: 142
        y: 438
        width: 220
        height: 40
        text: qsTr("DZIEN")
        anchors.horizontalCenterOffset: 0
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenterOffset: 69
        font.capitalization: Font.Capitalize
        font.family: "Ubuntu"
        transformOrigin: Item.Center
        anchors.verticalCenter: parent.verticalCenter
        font.bold: true
        background: Rectangle {
            color: "#e8d329"
            radius: 6
            border.color: "#4c4984"
            border.width: 6
        }
    }

 Button {
     id: oneTime2
     x: 144
     y: 437
     width: 220
     height: 40
     text: qsTr("GATUNEK")
     anchors.horizontalCenterOffset: 0
     anchors.horizontalCenter: parent.horizontalCenter
     anchors.verticalCenterOffset: 142
     font.capitalization: Font.Capitalize
     font.family: "Ubuntu"
     transformOrigin: Item.Center
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
