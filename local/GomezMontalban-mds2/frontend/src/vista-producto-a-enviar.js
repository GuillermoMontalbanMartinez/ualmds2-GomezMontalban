import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaProductoAEnviar extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="align-items: center; justify-content: center; margin-bottom: var(--lumo-space-m);" id="verticalLayoutProductoAEnviar">
 <vaadin-horizontal-layout>
  <vaadin-horizontal-layout>
   <h4 style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);">NUMERO DE PEDIDO</h4>
   <vaadin-text-field id="textNumeroPedidoProductoAEnviar" style="margin: var(--lumo-space-m);" readonly></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button style="align-self: center;" id="buttonFichaCliente" theme="primary">
     Ficha cliente 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button style="align-self: center;" id="buttonEntregado" theme="primary">
     Entregado 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto-a-enviar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoAEnviar.is, VistaProductoAEnviar);
