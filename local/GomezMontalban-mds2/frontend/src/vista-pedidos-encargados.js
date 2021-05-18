import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-pedido-encargado.js';

class VistaPedidosEncargados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="height: 40%; width: 100%;">
 <vista-pedido-encargado style="width: 100%; height: 100%;"></vista-pedido-encargado>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-pedidos-encargados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosEncargados.is, VistaPedidosEncargados);
