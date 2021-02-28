import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-seguimiento-del-pedido`
 *
 * VistaSeguimientoDelPedido element.
 *
 * @customElement
 * @polymer
 */
class VistaSeguimientoDelPedido extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
