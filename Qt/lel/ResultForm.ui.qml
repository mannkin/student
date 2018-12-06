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
        text: qsTr("TYTUL")
        horizontalAlignment: Text.AlignHCenter
        wrapMode: Text.WordWrap
        anchors.verticalCenterOffset: -152
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenter: parent.verticalCenter
        anchors.horizontalCenterOffset: 0
        font.pointSize: 30
        font.bold: true
    }

    Rectangle {
        id: oneMonth
        x: 37
        y: 100
        width: 150
        height: 200
        color: "#4caac5"
        radius: 6
        border.color: "#4c4984"
        transformOrigin: Item.Left
        border.width: 6
        anchors.verticalCenter: parent.verticalCenter

        Label {
            x: 40
            y: 92
            text: qsTr("OKLADKA")
        }
    }

    Label {
        color: "#e6370b"
        x: 447
        y: 123
        text: qsTr("INFO")
        font.pointSize: 13
        font.bold: true
    }

    Label {
        color: "#e6370b"
        x: 264
        y: 123
        text: qsTr("OBSADA")
        font.pointSize: 13
        font.bold: true
    }

    Button {
        id: oneTime
        x: 148
        y: 431
        width: 376
        height: 40
        text: qsTr("PRZEJDZ DO SZCZEGOLOWEGO REPERTUARU")
        anchors.horizontalCenterOffset: 0
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenterOffset: 145
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
