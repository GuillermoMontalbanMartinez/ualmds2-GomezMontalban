import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaCerrarSesionAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <h1>Cerrar sesión</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-button theme="primary">
   Cerrar sesión
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-m); width: 100%; flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-button style="flex-shrink: 0; align-self: center;" theme="primary">
   Cancelar
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-cerrar-sesion-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCerrarSesionAdmin.is, VistaCerrarSesionAdmin);
