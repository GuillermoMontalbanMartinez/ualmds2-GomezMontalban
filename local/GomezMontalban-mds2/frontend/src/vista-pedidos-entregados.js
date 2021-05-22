import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-productos-enviados.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaPedidosEntregados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="vaadinVerticalLayoutPedidosEntregados">
 <vaadin-button id="buttonInicioPedidosEntregados" style="align-self: flex-start;" theme="primary">
   Inicio 
 </vaadin-button>
 <h1 style="align-self: center;">Pedidos entregados</h1>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; align-items: center; justify-content: center; margin-bottom: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button id="vaadinButtonPedidosAEntregar" theme="primary">
     Pedidos a entregar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center;">
   <vaadin-button id="vaadinButtonPedidosEntregados" theme="primary" disabled>
     Pedidos entregados 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vista-productos-enviados style="align-self: center; width: 100%;" id="vistaListaProductosEnviados"></vista-productos-enviados>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidos-entregados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosEntregados.is, VistaPedidosEntregados);
