import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaProductoEnviado extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; border: #ccc solid 2px; border-radius : 20px; align-items: center; justify-content: center; margin-bottom: var(--lumo-space-m);" id="verticalLayoutProductoEnviado">
 <vaadin-horizontal-layout style="width: 100%; height: 100%; align-items: center; justify-content: center; align-self: center;">
  <h4 style="margin-bottom: var(--lumo-space-m); align-self: center; margin: var(--lumo-space-m);">Número de pedido</h4>
  <vaadin-text-field id="textNumeroPedido" readonly></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-button style="align-self: center; flex-shrink: 0; margin-top: var(--lumo-space-m);" id="buttonFichaCliente" theme="primary">
   Ficha cliente 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto-enviado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoEnviado.is, VistaProductoEnviado);
