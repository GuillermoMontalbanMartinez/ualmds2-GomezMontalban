package com.example.test;
import interfaz.*;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")

public class MainView extends VerticalLayout {
	
	Cibernauta cibernauta = new Cibernauta();
	
    public MainView(@Autowired GreetService service) {
    	add(cibernauta);
    	
    	login();

    }
    
    public void login() {
    	cibernauta.inicio_sesion.getVaadinLoginFormLoginInicioDeSesion().addLoginListener(e -> {
    		
    		
    		if(e.getUsername().equals("admin")) {
    			Administrador admin = new Administrador(); 
    			remove(cibernauta);
    			add(admin);
    		}
    		else if(e.getUsername().equals("usuario")) {
    			Cibernauta_registrado usuario = new Cibernauta_registrado(); 
    			remove(cibernauta);
    			add(usuario);
    		}
    		else if(e.getUsername().equals("transporte")) {
    			Empresa_de_transportes transporte = new Empresa_de_transportes(); 
    			remove(cibernauta);
    			add(transporte);
    		}    		
    		else if(e.getUsername().equals("compras")) {
    			Encargado_de_compras compras = new Encargado_de_compras(); 
    			remove(cibernauta);
    			add(compras);
    		}
    		
    		
    		
    		else {
    	    	Notification.show("Este usuario no esta registrado");
    		}
    	});
    	
    	
    	
    }
}
