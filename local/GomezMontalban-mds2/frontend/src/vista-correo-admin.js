import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-lista-emails-admin.js';

class VistaCorreoAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-m); align-self: center; flex-shrink: 0; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="justify-content: flex-end; align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">
    <h4 style="flex-shrink: 0; align-self: center;">Bandeja de entrada</h4>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; justify-content: flex-end; margin: var(--lumo-space-m);">
    <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary">
     Redactar mensaje 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vista-lista-emails-admin></vista-lista-emails-admin>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-correo-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCorreoAdmin.is, VistaCorreoAdmin);
