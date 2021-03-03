import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class EncargadoDeCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%; 
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-xl); padding-top: var(--lumo-space-xl);">
  <h1 style="width: 100%;">Bienvenido, selecciona la lista que desea ver</h1>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button theme="primary" style="width: 100%;">
    Compras enviadas 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 1;">
  <vaadin-button theme="primary" style="align-self: center; width: 100%; margin-top: var(--lumo-space-m);">
    Compras a enviar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'encargado-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(EncargadoDeCompras.is, EncargadoDeCompras);
