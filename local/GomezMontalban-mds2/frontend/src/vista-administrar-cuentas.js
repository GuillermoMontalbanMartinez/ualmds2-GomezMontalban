import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAdministrarCuentas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <h1 style="margin: var(--lumo-space-m);">Administrar cuentas de usuario</h1>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-shrink: 0; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-button theme="primary">
   Dar de alta cuenta de usuario
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m);">
  <vaadin-button theme="primary">
   Dar de baja cuenta de usuario
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrar-cuentas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarCuentas.is, VistaAdministrarCuentas);
