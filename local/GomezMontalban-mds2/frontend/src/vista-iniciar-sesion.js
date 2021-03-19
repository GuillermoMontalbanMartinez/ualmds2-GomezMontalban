import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-login/src/vaadin-login-form.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

class VistaIniciarSesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; background-color: #74EBD5; background-image: linear-gradient(90deg, #74EBD5 0%, #9FACE6 100%); height: 100%; align-items: center;" id="login">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%;">
  <h1 style="margin: var(--lumo-space-m); flex-shrink: 0; padding: var(--lumo-space-m);">Inicio de sesión</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m);" id="vaadinVerticalLayout-de-la-imagen-inicio-de-sesion">
  <iron-icon style="flex-shrink: 0; align-self: center; width: 10%; height: 100%;" icon="lumo:user" id="ironIcon"></iron-icon>
 </vaadin-vertical-layout>
 <vaadin-login-form style="flex-shrink: 0; align-self: center;" id="vaadinLoginForm-login-inicio-de-sesion"></vaadin-login-form>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;" id="vaadinVerticalLayout-registrarse-inicio-de-sesion">
  <vaadin-button style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" theme="primary" id="botton-registro">
    Registrarse 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-iniciar-sesion';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaIniciarSesion.is, VistaIniciarSesion);
