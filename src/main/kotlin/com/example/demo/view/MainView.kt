package com.example.demo.view

import javafx.geometry.Insets
import javafx.scene.layout.VBox
import tornadofx.*

class MainView : View() {

    override val root = VBox()

    init {
        with(root) {
            hbox {
                label("First Name") {
                    hboxConstraints { margin = Insets(5.0) }
                }
                textfield {
                    hboxConstraints { margin = Insets(5.0) }
                    useMaxWidth = true
                }
            }
            hbox {
                label("Last Name") {
                    hboxConstraints { margin = Insets(5.0) }
                }
                textfield {
                    hboxConstraints { margin = Insets(5.0) }
                    useMaxWidth = true
                }
            }
        }
    }
}

//class LoginForm : View("Login") {
//    val user = VBox()
//
//    override val root = form {
//        fieldset(title, labelPosition = Orientation.VERTICAL){
//            field("Username"){
//                textfield(user.username).required()
//            }
//            field("Password"){
//                passwordfield(user.password).required()
//            }
//            button("Login"){
//                enableWhen(user.valid)
//                action { user.login() }
//            }
//        }
//    }
//}