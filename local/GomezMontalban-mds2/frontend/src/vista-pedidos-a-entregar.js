import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-productos-a-enviar.js';

class VistaPedidosAEntregar extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center;">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button style="flex-shrink: 0; align-self: center;">
     Productos a entregar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button>
     Productos entregados 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vista-productos-a-enviar style="width: 100%;"></vista-productos-a-enviar>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidos-a-entregar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosAEntregar.is, VistaPedidosAEntregar);
