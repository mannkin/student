import QtQuick 2.11
import QtQuick.Controls 2.4

Page {
    id: page
    width: 600
    height: 400
    transformOrigin: Item.Center

    title: qsTr("PaymentPositive")

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
        text: qsTr("KONKRETNY TYTUL")
        horizontalAlignment: Text.AlignHCenter
        wrapMode: Text.WordWrap
        anchors.verticalCenterOffset: -153
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.verticalCenter: parent.verticalCenter
        anchors.horizontalCenterOffset: 0
        font.pointSize: 30
        font.bold: true
    }

    TextField {
        id: title
        placeholderText: "Title"
        x: 200
        y: 129
    }

    Rectangle {
        id: oneMonth
        x: 225
        y: 100
        width: 150
        height: 200
        color: "#4caac5"
        radius: 6
        anchors.verticalCenterOffset: 83
        transformOrigin: Item.Left
        anchors.verticalCenter: parent.verticalCenter
        Rectangle {
            id: rectangle1
            height: 59
            color: "#e8d329"
            radius: 6
            anchors.rightMargin: 0
            anchors.leftMargin: 0
            anchors.topMargin: 0
            anchors.right: parent.right
            Label {
                id: label3
                x: 53
                y: 21
                text: qsTr("TYTUL")
            }
            border.color: "#4c4984"
            anchors.left: parent.left
            border.width: 6
            anchors.top: parent.top
        }

        Label {
            id: label4
            x: 40
            y: 92
            text: qsTr("OKLADKA")
        }

        MouseArea {
            id: mouseArea
            anchors.fill: parent
        }
        border.color: "#4c4984"
        border.width: 6
    }
}
