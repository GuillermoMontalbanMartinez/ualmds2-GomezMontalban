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
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; justify-content: center;" id="vaadinVerticalLayoutPedidosAEntregar">
 <vaadin-button id="buttonCerrarSesion" style="align-self: flex-end;" theme="primary error">
  Cerrar sesión 
 </vaadin-button>
 <h1 style="align-self: center; flex-shrink: 0;">Pedidos a entregar</h1>
 <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center;">
   <vaadin-button style="flex-shrink: 0; align-self: center;" id="vaadinButtonProductosAEntregar" theme="primary" disabled>
     Productos a entregar 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="flex-shrink: 0; align-items: center; justify-content: center; align-self: center;">
   <vaadin-button id="vaadinButtonProductosEntregados" theme="primary">
     Productos entregados 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vista-productos-a-enviar style="width: 100%;" id="vistaListaProductosAEnviar"></vista-productos-a-enviar>
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
