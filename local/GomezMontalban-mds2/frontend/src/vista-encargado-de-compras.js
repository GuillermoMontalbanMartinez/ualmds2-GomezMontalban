import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEncargadoDeCompras extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center;" id="layout_encargado_de_compras">
 <vaadin-horizontal-layout theme="spacing">
  <h1>Bienvenido, selecciona la lista que desea ver</h1>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing">
  <vaadin-button theme="primary" id="button_compras_enviadas">
    Compras enviadas 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-button theme="primary" id="button_compras_a_enviar">
    Compras a enviar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-encargado-de-compras';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadoDeCompras.is, VistaEncargadoDeCompras);
