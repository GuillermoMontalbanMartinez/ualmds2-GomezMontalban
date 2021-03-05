import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-login/src/vaadin-login-form.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaIniciarSesion extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <h1 style="margin: var(--lumo-space-m); flex-shrink: 0; padding: var(--lumo-space-m);">Inicio de sesión</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m);">
  <img style="width: 100%; height: 100%; margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;">
 </vaadin-vertical-layout>
 <vaadin-login-form style="flex-shrink: 0; align-self: center;"></vaadin-login-form>
</vaadin-vertical-layout>
<vaadin-vertical-layout style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
 <vaadin-button style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m);" theme="primary">
   Registrate 
 </vaadin-button>
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
