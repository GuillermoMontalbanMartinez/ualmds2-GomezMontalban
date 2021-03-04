import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista-de-emails.js';

class VistaCorreoUsuario extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center;">
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: center;">
  <h2 style="flex-grow: 0;">Bandeja de entrada</h2>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-grow: 1; justify-content: center;">
  <vaadin-button theme="primary">
    Redactar mensaje 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-lista-de-emails style="width: 100%; height: 100%;"></vista-lista-de-emails>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-correo-usuario';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCorreoUsuario.is, VistaCorreoUsuario);
