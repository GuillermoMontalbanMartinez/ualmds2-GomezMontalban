import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaSeguimientoDelPedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <h1 style="margin-left: var(--lumo-space-l);">Seguimiento de pedidos</h1>
 <vaadin-horizontal-layout theme="spacing" style="justify-content: space-between; width: 100%; flex-shrink: 0; padding: var(--lumo-space-m);">
  <h4 style="flex-shrink: 0; flex-grow: 1;"> Productos comprados</h4>
  <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; align-items: center; width: 9%; flex-shrink: 0; justify-content: center;">
   <h4 style="margin-left: var(--lumo-space-m); padding-right: var(--lumo-space-xs); flex-grow: 0;">Estado del envio</h4>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="layoutPedidos" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-seguimiento-del-pedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaSeguimientoDelPedido.is, VistaSeguimientoDelPedido);
